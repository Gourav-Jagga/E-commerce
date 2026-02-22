from pathlib import Path
def scan(root, keywords):
    if isinstance(root, str):
        root = Path(root)
    if isinstance(keywords, str):
        keywords = [keywords]
    result = []
    for file in root.rglob("*"):
        if file.is_file():
            try:
                content = file.read_text(errors="ignore")
                if any(k in content for k in keywords):
                    result.append({
                        "name": file.name,
                        "path": str(file)
                    })
            except Exception:
                pass
    return result