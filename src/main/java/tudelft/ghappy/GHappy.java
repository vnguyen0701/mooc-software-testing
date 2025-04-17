package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        boolean containsG = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                containsG = true;
                if (i > 0 && str.charAt(i-1) == 'g') { return true; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { return true; }
            }
        }
            return false;
    }
}
