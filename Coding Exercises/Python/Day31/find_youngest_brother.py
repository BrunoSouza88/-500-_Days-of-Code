class Brother:
    def __init__(self, name, age):
        self.name = name
        self.age = age


def find_youngest_brother(brothers):
    if not brothers:
        return None

    youngest = brothers[0]
    for brother in brothers[1:]:
        if brother.age < youngest.age:
            youngest = brother

    return youngest
