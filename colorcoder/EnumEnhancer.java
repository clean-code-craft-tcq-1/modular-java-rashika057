package colorcoder;

import java.util.HashMap;
import java.util.Map;

interface HasIndex {
  public int getIndex();
}

class EnumEnhancer<E extends Enum<E> & HasIndex> {
  private Map<Integer, E> lookup;

  public EnumEnhancer(E[] values) {
    lookup = new HashMap<>();
    for (E e : values) {
      lookup.put(e.getIndex(), e);
    }
  }

  public E lookup(int key) {
    return lookup.get(key);
  }

  public int toString(E e) {
    return e.getIndex();
  }
}
