class Flower {
    void smell() {
        System.out.println("FLower");
    }
}

class Rose extends Flower {
    void smell() {
        // System.out.println(w.hashCode());
        System.out.println("Rose");
    }
}

class App {
    public static void main(String[] args) {
        Flower f = new Flower();
        Flower f1 = new Rose();
        Rose r = (Rose) f1;
        // Rose r1 = (Rose) f;
        f1.smell();
        r.smell();
        // r1.smell();
    }
}