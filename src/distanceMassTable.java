public class distanceMassTable {
    public static void main(String[] args) {
        double mass = 0;
        double length = 0;
        double height = 0;

        if (length <= 2.5){
            if (height <= 9){
                mass = 30;
            }
        } else if (length <= 3) {
            if (height <= 9){
                mass = 22.8;
            }
        } else if (length <= 4) {
            if (height <= 8){
                mass = 18.8;
            } else if (height <= 21) {
                mass = 14.3;
            } else if (height <= 25) {
                mass = 12;
            }
        } else if (length <= 5) {
            if (height <=7){
                mass = 15.8;
            } else if (height <= 14) {
                mass = 15.4;
            } else if (height <= 21) {
                mass = 14;
            } else if (height <= 25) {
                mass = 11.6;
            } else if (height <= 27) {
                mass = 10;
            }
        } else if (length <=6) {
            if (height <= 5){
                mass = 12.5;
            } else if (height <= 14) {
                mass = 12.7;
            } else if (height <= 20) {
                mass = 12.5;
            }
        } else if (length <= 7) {
            if (height <= 13){
                mass = 10.9;
            } else if (height <= 20) {
                mass = 10.3;
            } else if (height <= 25) {
                mass = 9.8;
            } else if (height <= 27) {
                mass = 8;
            } else if (height <= 35) {
                mass = 4.1;
            }
        } else if (length <= 8) {
            if (height <= 12){
                mass = 9.1;
            } else if (height <= 21) {
                mass = 8.7;
            } else if (height <= 24) {
                mass = 8.3;
            } else if (height <= 26) {
                mass = 7.1;
            } else if (height <= 35) {
                mass = 4;
            } else if (height <= 41) {
                mass = 2.1;
            }
        } else if (length <=9) {
            if (height <= 11){
                mass = 7.6;
            } else if (height <= 19) {
                mass = 7.5;
            } else if (height <= 24) {
                mass = 7.2;
            } else if (height <= 26) {
                mass = 6.5;
            }
        } else if (length <= 10) {
            if (height <= 10){
                mass = 6.4;
            } else if (height <= 18) {
                mass = 6.5;
            } else if (height <= 23) {
                mass = 6.3;
            } else if (height <= 25) {
                mass = 5.9;
            } else if (height <= 34) {
                mass = 3.8;
            } else if (height <= 41) {
                mass = 1.9;
            }
        } else if (length <= 12) {
            if (height <= 6){
                mass = 4.8;
            } else if (height <= 17) {
                mass = 4.8;
            } else if (height <= 22) {
                mass = 4.7;
            } else if (height <= 27) {
                mass = 4.7;
            } else if (height <= 33) {
                mass = 3.5;
            } else if (height <= 40) {
                mass = 1.8;
            }
        } else if (length <= 14) {
            if (height <= 14){
                mass = 3.8;
            } else if (height <= 21) {
                mass = 3.8;
            } else if (height <= 22) {
                mass = 3.7;
            } else if (height <= 32) {
                mass = 3.1;
            } else if (height <= 39) {
                mass = 1.6;
            }
        } else if (length <= 16) {
            if (height <= 11){
                mass = 3;
            } else if (height <= 18) {
                mass = 3.1;
            } else if (height <= 21) {
                mass = 3;
            } else if (height <= 31) {
                mass = 2.8;
            } else if (height <= 38) {
                mass = 1.5;
            }
        }
    }

}
