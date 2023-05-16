package org.example.connectivity;

public class WeightedQuickUnion {
    private int[] components;
    private final int[] size;
    public WeightedQuickUnion(int N) {
        size = new int[N];
        components = new int[N];
        for (int i = 0; i < components.length;i++) {
            components[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int proot = findRoot(p);
        int qroot = findRoot(q);
        if (proot == qroot) {
            return;
        }
        if (findLength(p) > findLength(q)) {
            components[proot] = qroot;
            size[proot] += size[qroot];
        } else {
            components[qroot] = proot;
            size[qroot] += size[proot];
        }
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

    public int findLength(int p) {
        return size[findRoot(p)];
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
