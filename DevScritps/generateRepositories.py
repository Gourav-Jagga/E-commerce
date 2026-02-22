from IOUtility import scan
import re
from pathlib import Path

repositoryTemplate = """package ${packageName}
@Repository
public interface ${entity}Repository extends BaseRepository<${entity},Long> {
}
"""

repositoryImplTemplate="""package ${packageName}
public class ${entity}RepositoryImpl extends BaseRepositoryImpl<${entity}, Long> implements ${entity}Repository {

    public ${entity}RepositoryImpl(EntityManager entityManager) {
        super(${entity}.class, entityManager);
    }
}
"""


def generate_repo_file(entity_file: Path, content: str):
    repo_file = entity_file
    print(f"\n👉 Processing: {entity_file}")
    print(f"   REPO target : {repo_file}")
    if repo_file.exists():
        print("   ⚠ Repository already exists — skipping")
        return
    repo_file.parent.mkdir(parents=True, exist_ok=True)
    with repo_file.open("x") as f:
        f.write(content)
    print("   ✅ DTO created")


def main(entity_path: str):
    print(f"🔎 Scanning entities in: {entity_path}")
    entity_scan = scan(entity_path, ["@Entity"])
    if not entity_scan:
        raise FileNotFoundError("NO ENTITY FOUND")
    print(f"✅ Found {len(entity_scan)} entity files")
    entityNamesList = []
    for item in entity_scan:
        entityNamesList.append(item["name"])
    for item in entity_scan:
        packageName = "com." + (item["path"].split("com/", 1)[1]).replace("/" + item["name"], ";").replace("/",
                                                                                                           ".").replace(
            "etdt", "repo")
        print(packageName)
        repositoryPath = Path(item["path"].replace("etdt", "repo").replace(item["name"].replace(".java", ""),
                                                                           item["name"].replace(".java",
                                                                                                "") + "Repository"))
        repositoryPathImpl = Path(item["path"].replace("etdt", "repo").replace(item["name"].replace(".java", ""),
                                                                           item["name"].replace(".java",
                                                                                                "") + "RepositoryImpl"))
        generate_repo_file(repositoryPath, repositoryTemplate.replace(
            "${entity}", item["name"].replace(".java", "")).replace("${packageName}", packageName))
        generate_repo_file(repositoryPathImpl, repositoryImplTemplate.replace(
            "${entity}", item["name"].replace(".java", "")).replace("${packageName}", packageName))

if __name__ == "__main__":
    entityPath = "/home/gj/Desktop/workspace/MyWorkSpace/E-commerce/Platform/src/main/java/com/gjdev/platform/persistance"
    main(entityPath)
