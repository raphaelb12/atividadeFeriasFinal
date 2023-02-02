package Questao02;

public class q2 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            int[] vetor = new int[26];
            for (int i = 0; i < A.length(); i++) {
                int num = A.charAt(i) - 'a';
                int j = ++vetor[num];
                if (j > 1){
                    return true;
                }
            }
            return false;
        }

        int teste = 0;
        boolean buddy = false;
        for (int i = 0; i < A.length(); i++) {
            if (teste != 0) {
                if (A.charAt(i) == B.charAt(i)) continue;
                else {
                    if (buddy) {
                        return false;
                    }

                    buddy = teste - (B.charAt(i) - A.charAt(i)) == 0;
                }
            }

            teste = A.charAt(i) - B.charAt(i);
        }

        return buddy;
    }

}


