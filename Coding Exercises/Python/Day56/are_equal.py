def are_equal(arg1, arg2):
    if arg1 is None and arg2 is None:
        return True

    if (arg1 is None and arg2 is not None) or \
            (arg1 is not None and arg2 is None):
        return False

    return arg1 == arg2
