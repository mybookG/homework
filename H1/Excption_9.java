import java.io.*;

class OvfException extends RuntimeException {
}

class ZeroException extends Exception {
}

class GetN {
    int get() throws ZeroException, IOException {
        int n;
        n = System.in.read() - '0';
        if (n == 0)
            throw new ZeroException();
        return n;
    }
}

class AddN {
    GetN gn;

    AddN(GetN gn) {
        this.gn = gn;
    }

    int get_addn() throws ZeroException, OvfException, IOException {
        int n = gn.get();
        n = n + 1;
        if (n > 5)
            throw new OvfException();
        return n;
    }
}

class H1_Exception {
    public static void main(String args[]) throws IOException {
        GetN gn = new GetN();
        AddN an = new AddN(gn);
        int n;
        try {
            n = an.get_addn();
            System.out.println(n);
        } catch (ZeroException e) {
            // if (e.toString().equals("ZeroException"))
            System.out.println("ZeroException");
            // else if (e.toString().equals("OvfException"))
            // System.out.println("OvfException");
        }
    }
}