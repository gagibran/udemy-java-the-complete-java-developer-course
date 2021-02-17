public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        while (bigCount >= 0) {
            if (bigCount == 0) {
                for (int i = smallCount; i > 0; i--){
                    if (i == goal) {
                        return true;
                    }
                }
            } else {
                for (int i = smallCount; i >= 0; i--) {
                    if (bigCount * 5 + i == goal) {
                        return true;
                    }
                }
            }
            bigCount--;
        }
        return false;
    }
}
