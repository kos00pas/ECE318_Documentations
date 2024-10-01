# Tutorial 2
## Scope: 
  1. Java  Collections and their iterations 
  2. Complexity, Searching &Sorting

# Java Collections 

| Collection | Description | Key Methods |
|------------|-------------|-------------|
| **Map**    | Stores key-value pairs, no duplicate keys | `put(K key, V value)`, `get(Object key)`, `containsKey(Object key)`, `remove(Object key)`, `keySet()`, `values()` |
| **Set**    | Stores unique elements, no duplicates allowed | `add(E e)`, `remove(Object o)`, `contains(Object o)`, `size()`, `isEmpty()`, `clear()` |
| **List**   | Ordered collection, allows duplicates | `add(E e)`, `get(int index)`, `remove(int index)`, `size()`, `set(int index, E e)`, `contains(Object o)` |
| **Stack**  | LIFO (Last In, First Out) structure, extends `Vector` | `push(E e)`, `pop()`, `peek()`, `isEmpty()`, `search(Object o)` |
| **Queue**  | FIFO (First In, First Out) structure | `add(E e)`, `offer(E e)`, `remove()`, `poll()`, `peek()`, `isEmpty()` |

# Java interfaces 
| Collection | Common Implementations |
|------------|------------------------|
| **Map<K, V>** | `HashMap<K, V>`, `TreeMap<K, V>`, `LinkedHashMap<K, V>`, `Hashtable<K, V>` |
| **Set<E>** | `HashSet<E>`, `TreeSet<E>`, `LinkedHashSet<E>` |
| **List<E>** | `ArrayList<E>`, `LinkedList<E>`, `Vector<E>` |
| **Stack<E>** | `Stack<E>`, `ArrayDeque<E>` |
| **Queue<E>** | `LinkedList<E>`, `PriorityQueue<E>`, `ArrayDeque<E>` |

# Iterator 
## Why Use `Iterator` Instead of `for-each`?

1. **Removing Elements:**  
   `for-each` can’t remove items during iteration, but `Iterator` allows it using `remove()`.

2. **More Control:**  
   `Iterator` gives manual control with `hasNext()` and `next()`, allowing conditional iteration and early exit.

3. **Custom Logic:**  
   For complex iteration logic, `Iterator` is better than the simplicity of `for-each`.

4. **Legacy APIs:**  
   Some older APIs only provide `Iterator`, not `for-each`.

# Iterator - ForEach

![](./images/foreachvsiterator.png)

# Generics

![](./images/generic.png)

# Interface

An interface in Java defines a set of methods that a class must implement. It only provides method signatures, not their implementations.

![](./images/interfaces_0.png)

# Collaction Syntax

![](./images/interfaces_1.png)

# Same method, different implementation 

![](./images/coll_diff.png)













# Home Study 

![](./images/homestudy.png)



# Compare Collections (optional to read)
### 1. Map Interface Comparison

| Map            | HashMap         | TreeMap           | LinkedHashMap    | Hashtable         |
|----------------|-----------------|-------------------|------------------|-------------------|
| **Underlying Structure** | Hash table      | Red-Black tree    | Hash table + Linked List | Hash table         |
| **Ordering**   | No ordering      | Sorted based on natural ordering or comparator | Insertion-order   | No ordering        |
| **Null Keys/Values** | One null key, multiple null values | No null keys, multiple null values | One null key, multiple null values | No null keys, no null values |
| **Thread Safety** | Not synchronized | Not synchronized  | Not synchronized | Synchronized      |
| **Performance** | O(1) average for get/put | O(log n) for get/put | O(1) average for get/put | O(1) average for get/put |
| **Use Case**   | Fast access with no ordering | Sorted map needed | Fast access + insertion order needed | Thread-safe map needed |

### 2. Set Interface Comparison

| Set            | HashSet         | TreeSet           | LinkedHashSet    |
|----------------|-----------------|-------------------|------------------|
| **Underlying Structure** | Hash table      | Red-Black tree    | Hash table + Linked List |
| **Ordering**   | No ordering      | Sorted based on natural ordering or comparator | Insertion-order   |
| **Null Values**| Allows one null element | Does not allow null elements | Allows one null element |
| **Thread Safety** | Not synchronized | Not synchronized  | Not synchronized |
| **Performance** | O(1) average for add, remove, contains | O(log n) for add, remove, contains | O(1) average for add, remove, contains |
| **Use Case**   | Fast set operations, no duplicates | Sorted set needed | Fast set operations + insertion order |

### 3. List Interface Comparison

| List           | ArrayList       | LinkedList        | Vector           |
|----------------|-----------------|-------------------|------------------|
| **Underlying Structure** | Dynamic array   | Doubly linked list | Dynamic array     |
| **Random Access** | Fast (O(1))    | Slow (O(n))       | Fast (O(1))       |
| **Insertion/Deletion** | Slow (O(n)) in the middle | Fast (O(1) at the beginning and end) | Slow (O(n)) in the middle |
| **Thread Safety** | Not synchronized | Not synchronized  | Synchronized      |
| **Growth Policy** | Grows by 50% when full | N/A (linked structure) | Grows by 100% (doubles) |
| **Use Case**   | Frequent access by index, few insertions | Frequent insertions/removals | Thread-safe list needed |

### 4. Stack Interface Comparison

| Stack          | Stack           | ArrayDeque        |
|----------------|-----------------|-------------------|
| **Underlying Structure** | Dynamic array (extends Vector) | Resizable array  |
| **Performance** | O(1) for push, pop | O(1) for push, pop  |
| **Thread Safety** | Synchronized    | Not synchronized   |
| **Additional Features** | Extends Vector, allows legacy methods | Preferred modern stack implementation |
| **Use Case**   | Thread-safe stack, legacy code | Preferred for modern LIFO stack usage |

### 5. Queue Interface Comparison

| Queue          | LinkedList      | PriorityQueue     | ArrayDeque       |
|----------------|-----------------|-------------------|------------------|
| **Underlying Structure** | Doubly linked list | Binary heap       | Resizable array  |
| **Ordering**   | Insertion-order | Natural ordering or custom comparator | Insertion-order   |
| **Null Elements** | Allows null     | Does not allow null | Does not allow null |
| **Thread Safety** | Not synchronized | Not synchronized  | Not synchronized |
| **Use Case**   | General-purpose queue, also a deque | Priority-based queue | High-performance general-purpose queue |
