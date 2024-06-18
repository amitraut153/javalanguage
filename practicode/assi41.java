import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Optimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int frames, pointer = 0, hit = 0, fault = 0, ref_len;
        boolean isFull = false;
        int[] buffer;
        int[] references;
        int[][] mem_layout;

        System.out.println("Please enter the number of frames:");
        frames = Integer.parseInt(br.readLine());

        System.out.println("Please enter the length of the References string:");
        ref_len = Integer.parseInt(br.readLine());

        references = new int[ref_len];
        mem_layout = new int[ref_len][frames];
        buffer = new int[frames];
        for (int j = 0; j < frames; j++) {
            buffer[j] = -1;
        }

        System.out.println("Please enter the references string:");
        for (int i = 0; i < ref_len; i++) {
            references[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < ref_len; i++) {
            int search = -1;
            for (int j = 0; j < frames; j++) {
                if (buffer[j] == references[i]) {
                    search = j;
                    hit++;
                    break;
                }
            }
            if (search == -1) {
                if (isFull) {
                    int[] index = new int[frames];
                    for (int j = 0; j < frames; j++) {
                        index[j] = -1;
                    }

                    for (int j = i + 1; j < ref_len; j++) {
                        for (int k = 0; k < frames; k++) {
                            if (references[j] == buffer[k] && index[k] == -1) {
                                index[k] = j;
                            }
                        }
                    }

                    int max = index[0];
                    pointer = 0;
                    for (int j = 1; j < frames; j++) {
                        if (index[j] == -1) {
                            pointer = j;
                            break;
                        }
                        if (index[j] > max) {
                            max = index[j];
                            pointer = j;
                        }
                    }
                }
                buffer[pointer] = references[i];
                fault++;
                pointer++;
                if (pointer == frames) {
                    pointer = 0;
                    isFull = true;
                }
            }
            for (int k = 0; k < frames; k++) {
                mem_layout[i][k] = buffer[k];
            }
        }

        System.out.println("The number of Hits: " + hit);
        System.out.println("Hit Ratio: " + (float) hit / ref_len);
        System.out.println("The number of faults: " + fault);
    }
}
