package org.example

class BinaereSuche {
    boolean binaereSuche(w, L) {
        int first = 0
        int last = L.size() - 1
        while (first <= last) {
            int middle = (first+last) / 2
            if (L[middle] < w) {
                first = middle + 1
            }
            else {
                if (L[middle] == w) return true
                last = middle - 1
            }
        }
        return false
    }

    static void main(String[] args) {
        List<Integer> L = [1, 5, 7, 23, 44, 234]
        int w = 44
        boolean result = new BinaereSuche().binaereSuche(w, L)
        println("The number is found: ${result}")
    }
}