import matplotlib.pyplot as plt
import numpy as np
quicksort = np.array([4,2,4,7,11,16])
arraysort = np.array([0,2,0,1,1,0])
mergesort = np.array([2,3,2,3,4,5])
selection = np.array([25,83,182,322,503,722])
x = np.array([10000,20000,30000,40000,50000,60000])

plt.plot(x,quicksort, label = "Quick Sort")
plt.plot(x,arraysort, label = "Array Sort")
plt.plot(x,mergesort, label = "Merge Sort")
plt.plot(x,selection, label = "Selection Sort")
plt.xlabel("Array Size")
plt.ylabel("Time In ms")
plt.title("Time vs Array Size")
plt.legend()
plt.savefig("TimevsArray.png")
plt.show()
