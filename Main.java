import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

// Implementación de una pila (Stack) - LIFO
class CustomStack<T> {
    private Stack<T> stack;
    
    public CustomStack() {
        stack = new Stack<>();
    }
    
    public void push(T item) {
        stack.push(item);
    }
    
    public T pop() {
        return stack.pop();
    }
    
    public T peek() {
        return stack.peek();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

// Implementación de una cola (Queue) - FIFO
class CustomQueue<T> {
    private Queue<T> queue;
    
    public CustomQueue() {
        queue = new LinkedList<>();
    }
    
    public void enqueue(T item) {
        queue.offer(item);
    }
    
    public T dequeue() {
        return queue.poll();
    }
    
    public T peek() {
        return queue.peek();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

// Implementación de un diccionario (Hash Table)
class CustomDictionary<K, V> {
    private Map<K, V> dictionary;
    
    public CustomDictionary() {
        dictionary = new HashMap<>();
    }
    
    public void put(K key, V value) {
        dictionary.put(key, value);
    }
    
    public V get(K key) {
        return dictionary.get(key);
    }
    
    public boolean containsKey(K key) {
        return dictionary.containsKey(key);
    }
    
    public void remove(K key) {
        dictionary.remove(key);
    }
}

public class Main {
    public static void main(String[] args) {
        // Prueba de la pila
        System.out.println("Tarea 1, Carlos Mallén Gutiérrez, a00831838");
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("Ejemplo de la pila, aquí hay una pila que tiene 1 y despues el 2, y el 2 es el que se encuentra en la parte superior de la pila, por lo tanto, al hacer pop, se debe eliminar el 2 y devolverlo: ");
        System.out.println("Pila: " + stack.pop()); // Debería imprimir 2
        
        // Prueba de la cola
        CustomQueue<String> queue = new CustomQueue<>();
        queue.enqueue("Hola");
        queue.enqueue("Mundo");
        System.out.println("Ejemplo de la cola, aquí hay una cola que tiene Hola y Mundo, y el Hola es el primero en entrar, por lo tanto, al hacer dequeue, se debe eliminar el Hola y devolverlo: ");
        System.out.println("Cola: " + queue.dequeue()); // Debería imprimir "Hola"
        
        // Prueba del diccionario
        CustomDictionary<String, Integer> dictionary = new CustomDictionary<>();
        dictionary.put("Uno", 1);
        dictionary.put("Dos", 2);
        System.out.println("Ejemplo del diccionario, aquí hay un diccionario que tiene Uno y Dos, y el Uno tiene el valor 1, por lo tanto, al hacer get con la clave Uno, se debe devolver 1: ");
        System.out.println("Diccionario: " + dictionary.get("Uno")); // Debería imprimir 1
    }
}
