package exercises.week10.exercise02;

public class Student {

        private String gender;
        private String ParentalEducation;
        private Integer mathScore;
        private Integer readingScore;
        private Integer wrikttingScore;

        public Student(String gender, String parentalEducation, Integer mathScore, Integer readingScore, Integer wrikttingScore) {
            this.gender = gender;
            ParentalEducation = parentalEducation;
            this.mathScore = mathScore;
            this.readingScore = readingScore;
            this.wrikttingScore = wrikttingScore;
        }

        public String getGender() {
            return gender;
        }

        public String getParentalEducation() {
            return ParentalEducation;
        }

        public Integer getMathScore() {
            return mathScore;
        }

        public Integer getReadingScore() {
            return readingScore;
        }

        public Integer getWrikttingScore() {
            return wrikttingScore;
        }

        @Override
        public String toString() {
            return "Performances{" +
                    "gender='" + gender + '\'' +
                    ", ParentalEducation='" + ParentalEducation + '\'' +
                    ", mathScore=" + mathScore +
                    ", readingScore=" + readingScore +
                    ", wrikttingScore=" + wrikttingScore +
                    '}';
        }
         public Integer getAverageScore( ){
            return (mathScore+readingScore+wrikttingScore)/3;
         }
}

