package com.algorhythm.easy.array;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntersectionOfThreeSortedArray {
    public static void main(String[] args) {
        Date date = new Date();
        new IntersectionOfThreeSortedArray().arraysIntersection(
                new int[]{38, 55, 76, 112, 117, 152, 172, 180, 190, 221, 234, 317, 331, 332, 333, 349, 378, 383, 394, 396, 398, 416, 429, 471, 473, 478, 524, 537, 555, 568, 606, 626, 627, 646, 663, 668, 672, 683, 686, 697, 708, 720, 760, 789, 799, 805, 826, 829, 832, 858, 878, 932, 936, 976, 1026, 1033, 1079, 1086, 1141, 1179, 1183, 1204, 1250, 1256, 1265, 1270, 1326, 1353, 1357, 1420, 1431, 1436, 1438, 1445, 1452, 1455, 1462, 1506, 1523, 1545, 1577, 1617, 1635, 1670, 1681, 1712, 1721, 1730, 1756, 1760, 1762, 1767, 1781, 1891, 1893, 1899, 1921, 1925, 1974, 1988},
                new int[]{49, 50, 101, 143, 172, 184, 186, 225, 236, 279, 299, 343, 371, 373, 395, 403, 414, 417, 444, 462, 464, 467, 499, 526, 529, 541, 552, 560, 579, 598, 613, 616, 619, 650, 672, 685, 704, 719, 738, 745, 757, 830, 833, 846, 873, 897, 922, 929, 952, 1004, 1008, 1029, 1070, 1120, 1142, 1151, 1167, 1191, 1198, 1211, 1217, 1227, 1249, 1272, 1303, 1306, 1323, 1324, 1349, 1367, 1378, 1398, 1416, 1433, 1471, 1488, 1501, 1521, 1529, 1547, 1560, 1562, 1581, 1582, 1634, 1674, 1722, 1730, 1744, 1757, 1786, 1801, 1806, 1813, 1836, 1887, 1892, 1895, 1908, 1928},
                new int[]{4, 25, 90, 100, 154, 205, 287, 297, 302, 306, 339, 348, 350, 351, 368, 414, 442, 459, 488, 501, 535, 556, 578, 593, 614, 619, 650, 661, 671, 673, 722, 727, 814, 819, 869, 877, 882, 888, 925, 949, 972, 978, 980, 981, 1006, 1054, 1056, 1059, 1076, 1077, 1086, 1087, 1121, 1127, 1159, 1211, 1219, 1222, 1227, 1250, 1284, 1293, 1320, 1357, 1361, 1377, 1395, 1407, 1412, 1418, 1427, 1441, 1485, 1490, 1494, 1499, 1558, 1566, 1597, 1617, 1695, 1712, 1771, 1778, 1781, 1784, 1793, 1801, 1805, 1827, 1846, 1859, 1862, 1883, 1886, 1906, 1913, 1960, 1974, 1984}
        );
        System.out.println(new Date().getTime() - date.getTime());
    }

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if ((arr1[i] == arr2[j]) && (arr1[i] == arr3[k])) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
                System.out.println(i + ":" + j + ":" + k);
                continue;
            }

            int max = Math.max(Math.max(arr1[i], arr2[j]), arr3[k]);
            if (arr1[i] < max) {
                i = findIndex(arr1, i, max);
            }

            if (arr2[j] < max) {
                j = findIndex(arr2, j, max);
            }

            if (arr3[k] < max) {
                k = findIndex(arr3, k, max);
            }
        }

        return result;
    }

    private int findIndex(int[] arr, int currIndex, int value) {
        while (currIndex < arr.length && arr[currIndex] < value) {
            currIndex++;
        }
        return currIndex;
    }
}
