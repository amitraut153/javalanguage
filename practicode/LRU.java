import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LRU {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int frames, pointer = 0, hit = 0, fault = 0, ref_len;
        boolean isFull = false;
        int[] buffer;

        System.out.println("Please enter the number of frames:");
        frames = Integer.parseInt(br.readLine());

        System.out.println("Please enter the length of the reference string:");
        ref_len = Integer.parseInt(br.readLine());

        int[] reference = new int[ref_len];
        int[][] mem_layout = new int[ref_len][frames];
        buffer = new int[frames];

        for (int j = 0; j < frames; j++)
            buffer[j] = -1;

        System.out.println("Please enter the reference string:");
        for (int i = 0; i < ref_len; i++) {
            reference[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < ref_len; i++) {
            if (stack.contains(reference[i])) {
                stack.remove(stack.indexOf(reference[i]));
            }
            stack.add(reference[i]);
            int search = -1;
            for (int j = 0; j < frames; j++) {
                if (buffer[j] == reference[i]) {
                    search = j;
                    hit++;
                    break;
                }
            }
            if (search == -1) {
                if (isFull) {
                    int min_loc = ref_len;
                    for (int j = 0; j < frames; j++) {
                        if (stack.contains(buffer[j])) {
                            int temp = stack.indexOf(buffer[j]);
                            if (temp < min_loc) {
                                min_loc = temp;
                                pointer = j;
                            }
                        }
                    }
                }
                buffer[pointer] = reference[i];
                fault++;
                pointer++;
                if (pointer == frames) {
                    pointer = 0;
                    isFull = true;
                }
            }
            for (int j = 0; j < frames; j++)
                mem_layout[i][j] = buffer[j];
        }

        for (int i = 0; i < frames; i++) {
            for (int j = 0; j < ref_len; j++) {
                System.out.printf("%3d ", mem_layout[j][i]);
            }
            System.out.println();
        }
        System.out.println("The number of Hits: " + hit);
        System.out.println("Hit Ratio: " + (float) hit / ref_len);
        System.out.println("The number of faults: " + fault);
    }
}
