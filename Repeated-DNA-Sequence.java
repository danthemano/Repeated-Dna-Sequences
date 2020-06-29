class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < s.length()-9; i ++){
            int j = i + 9;

            //checks if the sequence is already in the set
            if(!set.add(s.substring(i, j+1)))

                //checks if the sequence is already in the list of repeated sequences
                if(!list.contains(s.substring(i, j+1)))
                    list.add(s.substring(i, j+1));
        }

        return list;
    }
}