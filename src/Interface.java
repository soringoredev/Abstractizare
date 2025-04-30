interface Desenabil {
    void deseneaza();
}


//Implemeentarea de catre al doilea utilizator
class Patrat implements Desenabil {
    public void deseneaza() {
        System.out.println("desenam patrat");
    }
}
class Cerc implements Desenabil {
    public void deseneaza() {
        System.out.println("desenam cerc");
    }
}


class Interface {

    protected interface Joricable {
        void deseneaza();

    }

    public static void main(String[] args) {
        Desenabil d = new Cerc();
        d.deseneaza();
    }
}