package craneDistanceCalculator;

public class DistanceMassTable {
    public static double massLimit(double distance, double height) {
        double mass = 0;

        if (distance <= 2.5){
            if (height <= 9){
                mass = 30;
            }
        } else if (distance <= 3) {
            if (height <= 9){
                mass = 22.8;
            }
        } else if (distance <= 4) {
            if (height <= 8){
                mass = 18.8;
            } else if (height <= 21) {
                mass = 14.3;
            } else if (height <= 25) {
                mass = 12;
            }
        } else if (distance <= 5) {
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
        } else if (distance <=6) {
            if (height <= 5){
                mass = 12.5;
            } else if (height <= 14) {
                mass = 12.7;
            } else if (height <= 20) {
                mass = 12.5;
            }
        } else if (distance <= 7) {
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
        } else if (distance <= 8) {
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
        } else if (distance <=9) {
            if (height <= 11){
                mass = 7.6;
            } else if (height <= 19) {
                mass = 7.5;
            } else if (height <= 24) {
                mass = 7.2;
            } else if (height <= 26) {
                mass = 6.5;
            }
        } else if (distance <= 10) {
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
        } else if (distance <= 12) {
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
        } else if (distance <= 14) {
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
        } else if (distance <= 16) {
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
        } else if (distance <= 18) {
            if (height <= 6){
                mass = 2.5;
            } else if (height <= 16) {
                mass = 2.4;
            } else if (height <= 19) {
                mass = 2.4;
            } else if (height <= 30) {
                mass = 2.3;
            } else if (height <= 37) {
                mass = 1.4;
            }
        }else if (distance <= 20) {
            if (height <= 12){
                mass = 2;
            } else if (height <= 16) {
                mass = 2;
            } else if (height <= 28) {
                mass = 1.9;
            } else if (height <= 36) {
                mass = 1.4;
            }
        } else if (distance <= 22) {
            if (height <= 7){
                mass = 1.7;
            } else if (height <= 12) {
                mass = 1.7;
            } else if (height <= 26) {
                mass = 1.6;
            } else if (height <= 35) {
                mass = 1.2;
            }
        } else if (distance <= 24) {
            if (height <= 5){
                mass = 1.3;
            } else if (height <= 24) {
                mass = 1.4;
            } else if (height <= 33) {
                mass = 1.2;
            }
        } else if (distance <= 26) {
            if (height <= 22) {
                mass = 1.2;
            } else if (height <= 31) {
                mass = 1.1;
            }
        } else if (distance <= 28) {
            if (height <= 19) {
                mass = 1;
            } else if (height <= 29) {
                mass = 1;
            }
        } else if (distance <= 30) {
            if (height <= 14) {
                mass = 0.9;
            } else if (height <= 27) {
                mass = 0.8;
            }
        } else if (distance <= 32) {
            if (height <= 24) {
                mass = 0.7;
            }
        } else if (distance <= 34) {
            if (height <= 21) {
                mass = 0.6;
            }
        } else if (distance <= 36) {
            if (height <= 16) {
                mass = 0.5;
            }
        }
        return mass;
    }

}
