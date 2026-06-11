public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> list = new ArrayList<>();

        try {
            Scanner file = new Scanner(new File("rivals.csv"));
            file.nextLine();

            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");

                String n = parts[0];
                String r = parts[1];
                double w = Double.parseDouble(parts[2]);

                Hero h = new Hero(n, r, w);
                list.add(h);
            }

            file.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i).getWinRate();
        }

        double avg = total / list.size();
        System.out.println("Average win rate is " + avg);

        Hero best = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWinRate() > best.getWinRate()) {
                best = list.get(i);
            }
        }

        System.out.println("Best hero is " + best.getName());

        int d = 0;
        int t = 0;
        int s = 0;

        for (Hero h : list) {
            if (h.getRole().equals("Duelist")) {
                d++;
            } else if (h.getRole().equals("Tank")) {
                t++;
            } else {
                s++;
            }
        }

        System.out.println("Duelists: " + d);
        System.out.println("Tanks: " + t);
        System.out.println("Supports: " + s);
    }
}