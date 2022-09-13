package Week7_Day2;

public class Square {

        public int sideLenght;


        public  Square(){

        }
    public Square (int sideLenght){
        this.sideLenght=sideLenght;

        }

        public int calculateArea(){
            return (int)Math.pow(this.sideLenght,2);
        }

        public double calculateArea(int sideLenght){
            return Math.pow(sideLenght,2);
        }



    public int calculatePerimeter(){
        return 4*this.sideLenght;
    }

    public double calculatePerimeter(int sideLenght){
        return 4*this.sideLenght;
        }

    }


