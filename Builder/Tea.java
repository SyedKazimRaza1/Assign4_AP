package Builder;

public class Tea {


    private String type;
    private boolean sugar;
    private boolean milk;
    private String size;

    //Returned TeaBuilder build method;

    private Tea(TeaBuilder teaBuilder) {
        this.type = teaBuilder.type;
        this.sugar = teaBuilder.sugar;
        this.milk = teaBuilder.milk;
        this.size = teaBuilder.size;

    }

    public static class TeaBuilder {
        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        public TeaBuilder(String type) {
            this.type = type;
        }

        public TeaBuilder sugar(boolean sugar1)
        {
            sugar=sugar1;
            return this;
        }

        public TeaBuilder milk(boolean value)
        {
            milk=value;
            return this;
        }
        public Tea build(){
            return new Tea(this);
        }
        public TeaBuilder size(String value)
        {
            size=value;
            return this;
        }

    }

}
