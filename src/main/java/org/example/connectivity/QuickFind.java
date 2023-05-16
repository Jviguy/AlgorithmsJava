package org.example.connectivity;

import java.util.ArrayList;

public class QuickFind {
    private final int[] components;

    public QuickFind(int N) {
        components = new int[N];
        for (int i = 0; i < components.length;i++) {
            components[i] = i;
        }

    }

    public void union(int p, int q) {
        int pid = components[p];
        int qid = components[q];
        int idx = 0;
        for (int id : components) {
            if (id == qid) {
                components[idx]=pid;
            }
            idx++;
        }
    }

    public boolean connected(int p, int q) {
        return components[p] == components[q];
    }

    public int count() {
        return components.length;
    }

    public int[] getComponents() {
        return components;
    }
}
