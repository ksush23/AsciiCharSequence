import java.util.*;

public class AsciiCharSequence implements java.lang.CharSequence{

    private byte[] sequence;

    public AsciiCharSequence(byte[] sequence) {
        this.sequence = new byte[sequence.length];
        for (int i = 0; i < sequence.length; i++){
            this.sequence[i] = sequence[i];
        }
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return Character.toChars(sequence[index])[0];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sequence, start, end));
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sequence.length; i++){
            stringBuilder.append(Character.toChars(sequence[i]));
        }
        return stringBuilder.toString();
    }
}
