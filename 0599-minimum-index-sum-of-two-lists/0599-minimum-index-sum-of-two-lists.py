class Solution(object):
    def findRestaurant(self, list1, list2):
        min_sum = float('inf')
        answer = []

        for i in list1:
            if i in list2:
                sum = list1.index(i) + list2.index(i)

                if sum < min_sum:
                    answer = [i]
                    min_sum = sum

                elif sum == min_sum:
                    answer.append(i)

        return answer