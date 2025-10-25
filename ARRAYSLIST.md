**ArrayList<Integer> vals = new ArrayList<Integer>()**

The declaration creates reference variable vals that refers to a new ArrayList object consisting of Integer objects. 
The ArrayList list size can grow to contain the desired elements. 
An ArrayList is an ordered list of reference type items that comes with Java. Each item in an ArrayList is known as an element. 

The statement import java.util.ArrayList; enables use of an ArrayList.

    ArrayList methods
        add()	
          add(element) 
          Create space for and add the element at the end of the list.
        get()	
          get(index) 
          Returns the element at the specified list location known as the index. Indices start at 0.
        set()	
          set(index, element) 
          Replaces the element at the specified position in this list with the specified element.
        size()	
          size()
          Returns the number of list elements.
        isEmpty()	
            boolean isEmpty()
            Returns true if the ArrayList does not contain any elements. Otherwise, returns false.
        clear()	
            void clear()
            Removes all elements from the ArrayList.
        remove()	
            boolean remove(T existingElement)
            Removes the first occurrence of an element which refers to the same object as existingElement.
            Elements from higher positions are shifted back to fill gap. ArrayList size is decreased by one.
            Return true if specified element was found and removed.
            T remove(int index)
            Removes element at specified index. Elements from higher positions are shifted back to fill gap.
            ArrayList size is decreased by one. Returns reference to element removed from ArrayList.
