from IOUtility import scan
import re
from pathlib import Path
def build_dto_content(content: str,entityNamesList: list) -> str:
    lines = []
    for line in content.splitlines():
        if "@" in line:
            continue
        for entityName in entityNamesList:
            if entityName in line:
                pattern = rf"\b{re.escape(entityName)}\b"
                line = re.sub(pattern, entityName + "DTO", line)
        lines.append(line)
    return "\n".join(lines) + "\n"
def generate_dto_file(entity_file: Path, content: str):
    dto_file = entity_file.with_name(entity_file.stem + "DTO.java")
    print(f"\n👉 Processing: {entity_file}")
    print(f"   DTO target : {dto_file}")
    if dto_file.exists():
        print("   ⚠ DTO already exists — skipping")
        return
    dto_file.parent.mkdir(parents=True, exist_ok=True)
    with dto_file.open("x") as f:
        f.write(content)
    print("   ✅ DTO created")
def main(entity_path: str):
    print(f"🔎 Scanning entities in: {entity_path}")
    entity_scan = scan(entity_path, ["@Entity", "@Column", "@MappedSuperclass"])
    if not entity_scan:
        raise FileNotFoundError("NO ENTITY FOUND")
    print(f"✅ Found {len(entity_scan)} entity files")
    entityNamesList=[]
    for item in entity_scan:
        entityNamesList.append(item["name"].replace(".java",""))
    for item in entity_scan:
        entity_file = Path(item["path"])
        print(f"\n📄 Reading: {entity_file}")
        try:
            content = entity_file.read_text(errors="ignore")
        except Exception as e:
            print(f"   ❌ Failed reading file: {e}")
            continue
        new_content = build_dto_content(content,entityNamesList)
        try:
            generate_dto_file(entity_file, new_content)
        except Exception as e:
            print(f"   ❌ Failed creating DTO: {e}")
if __name__ == "__main__":
    entityPath = "/home/gj/Desktop/workspace/MyWorkSpace/E-commerce/Platform/src/main/java/com/gjdev/platform/persistance"
    main(entityPath)