class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i)))
                s += address.charAt(i);
            else
                s += "[.]";
        }
        return s;
    }
}