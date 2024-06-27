class QueueDemo {
    public static void main(String[] args) {
        Queue namesQueue = new Queue(3);
        namesQueue.put("Zelim");
        namesQueue.put("Ruslan");
        namesQueue.put("Ilyas");
        namesQueue.put("Rizone");
        System.out.println(namesQueue.get());
    }
}

class Queue {
    private String[] queueNames;
    private int putloc, getloc;

    Queue(int size) {
        queueNames = new String[size];
        putloc = getloc = 0;
    }
    void put(String name) {
        if(putloc == queueNames.length) {
            System.out.println("Queue is full");
            return;
        }
        queueNames[putloc++] = name;
    }
    String get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return "";
        }
        return queueNames[getloc++];
    }
}