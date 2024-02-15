class Constructor {
    public static class Dog {
        String name;
        int rno;

        public Dog(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Bruno");
        System.out.println(myDog.name);
    }
}
