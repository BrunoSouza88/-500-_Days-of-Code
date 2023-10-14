def distribute_chocolates(chocolates, num_children):
    num_chocolates = len(chocolates)
    chocolates_per_child = num_chocolates // num_children
    distribution = [chocolates_per_child] * num_children
    chocolates_left = num_chocolates % num_children
    for i in range(chocolates_left):
        distribution[i] += 1
    return distribution
