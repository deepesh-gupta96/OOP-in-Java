import java.util.*;
public class RecordingSort {
    public static void main(String[] args) {
        Recording[] recordingsArray = new Recording[5];
        int a, b;
        Recording temp;
        final int MAXSIZE = recordingsArray.length - 1;
        int iterations = MAXSIZE;
        Scanner sc = new Scanner(System.in);
        String input;
        for (a = 0; a < recordingsArray.length; ++a) {
            if (recordingsArray[a] == null) {
                recordingsArray[a] = new Recording();
                System.out.println("Enter the song name:");
                String song_name = sc.nextLine();
                recordingsArray[a].setSong(song_name);
                System.out.println("Enter the Artist name: ");
                String artist_name = sc.nextLine();
                recordingsArray[a].setArtist(artist_name);
                System.out.println("Enter the play time: ");
                int time = sc.nextInt();
                recordingsArray[a].setPlayTime(time);
                sc.nextLine();
            }
        }
        display(recordingsArray, 0);
        System.out.println("Please enter S, A or T to sort the array by: ");
        input = sc.nextLine();
        switch (input.toUpperCase()) {
            case "S":
                for (a = 0; a < MAXSIZE; ++a) {
                    for (b = 0; b < iterations; ++b) {
                        if (recordingsArray[b].getSong().compareTo(recordingsArray[b + 1].getSong()) > 0) {
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b + 1];
                            recordingsArray[b + 1] = temp;
                        }
                    }
                    display(recordingsArray, (a + 1));
                    --iterations;
                }
                break;
            case "A":
                for (a = 0; a < MAXSIZE; ++a) {
                    for (b = 0; b < iterations; ++b) {
                        if (recordingsArray[b].getArtist().compareTo(recordingsArray[b + 1].getArtist()) > 0) {
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b + 1];
                            recordingsArray[b + 1] = temp;
                        }
                    }
                    display(recordingsArray, (a + 1));
                    --iterations;
                }
                break;
            case "T":
                for (a = 0; a < MAXSIZE; ++a) {
                    for (b = 0; b < iterations; ++b) {
                        if (recordingsArray[b].getPlayTime() > recordingsArray[b + 1].getPlayTime()) {
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b + 1];
                            recordingsArray[b + 1] = temp;
                        }
                    }
                    display(recordingsArray, (a + 1));
                    --iterations;
                }
                break;
        }
    }

    public static void display(Recording[] recordingsArray, int iterations) {
        System.out.println("Iteration #" + iterations);
        for (int x = 0; x < recordingsArray.length; ++x)
            System.out.println("Title: " + recordingsArray[x].getSong() + " " +
                    "Artist: " + recordingsArray[x].getArtist() + " " +
                    "Playtime: " + recordingsArray[x].getPlayTime());
        System.out.println();
    }
}
