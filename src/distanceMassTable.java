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
            } else if (height <= ) {
                
            }
        }
    }

}