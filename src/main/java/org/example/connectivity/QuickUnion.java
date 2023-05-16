package org.example.connectivity;

public class QuickUnion {
    private int[] components;
    public QuickUnion(int N) {
        components = new int[N];
        for (int i = 0; i < components.length;i++) {
            components[i] = i;
        }
    }

    public void union(int p, int q) {
        int proot = findRoot(p);
        int qroot = findRoot(q);
        components[proot] = qroot;
    }

    public boolean connected(int p, int q) {
        int proot = findRoot(p);
        int qroot = findRoot(q);
        return proot == qroot;
    }

    public int findRoot(int p) {
        if (p == components[p]) {
            return p;
        }
        return findRoot(components[p]);
    }
    public int count() {
        return components.length;
    }

    public int[] getComponents() {
        return components;
    }

    public void setComponents(int[] comps) {
        components = comps;
    }
}
