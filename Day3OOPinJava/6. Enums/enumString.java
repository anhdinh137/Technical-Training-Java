public class enumString {
    enum cards {
        HEART("hearts"), DIAMOND("diamond"), CLUB("club"), SPADE("spade");

        private final String description;

        cards(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }
}
