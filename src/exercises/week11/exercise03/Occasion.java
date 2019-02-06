package exercises.week11.exercise03;

import java.time.LocalTime;

public class Occasion {

        private LocalTime start;
        private LocalTime end;
        private String name;

        public Occasion(LocalTime start, LocalTime end, String name) {
            this.start = start;
            this.end = end;
            this.name = name;
        }

        public String getOccasion() {
            return name;
        }

        public Boolean isBetween(LocalTime currentTime) {
            boolean isBetweenInterval = currentTime.isAfter(start) && currentTime.isBefore(end);
            boolean isEqualInterval = currentTime.equals(start) || currentTime.equals(end);
            return isBetweenInterval || isEqualInterval;
        }
}
