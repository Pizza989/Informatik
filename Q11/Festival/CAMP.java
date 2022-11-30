public class CAMP
{
    private ORT ort;
    private BESUCHER[] besucher;

    public CAMP() {

    }

    public boolean nachbarplätzeVerfügbar(int n) {
        int streak = 0;
        for (BESUCHER b : besucher) {
            if (streak == n) return true;
            if (b == null) streak++;
            else streak = 0;
        }
        return false;
    }
}
