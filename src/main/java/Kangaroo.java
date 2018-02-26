public class Kangaroo {
    public String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if (x1 == x2) {
            return v1 == v2 ? "YES" : "NO";
        }
        if (x1 < x2) {
            if (v1 < v2) {
                return "NO";
            } else {
                return canMeet(x1, v1, x2, v2) ? "YES" : "NO";
            }
        } else {
            if (v1 > v2) {
                return "NO";
            } else {
                return canMeet(x2, v2, x1, v1) ? "YES" : "NO";
            }
        }
    }

    private boolean canMeet(int x1, int v1, int x2, int v2) {
        int  location1 = x1;
        int  location2 = x2;

        if (x1 < x2) {
            return validateVelocity(v1, v2, location1, location2);
        } else {
            return validateVelocity(v2, v1, location2, location1);
        }
    }

    private boolean validateVelocity(int v1, int v2, int location1, int location2) {
        if (v1 < v2) {
            return false;
        } else {
            while (location1 != location2) {
                location1 = location1 + v1;
                location2 = location2 + v2;
                if (location1 > location2) {
                    return false;
                }
            }
            return true;
        }
    }
}
