with open("a.txt", "w") as file:
    text = (
        """\
《春夜》
柳影摇清梦，
花香入酒中。
孤灯人不语，
月照故园风。
"""
        * 8000
    )
    file.write(text)
