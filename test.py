#%%
import matplotlib.pyplot as plt                                     
import matplotlib as mpl                                            
import numpy as np                                                  
                                                                    
x = np.linspace(0, 20, 100)                                         
plt.plot(x, np.sin(x))                                              
plt.show()                                                          
                                                                    
                                                                    
# %%                                                                
print("Hello world")                                                
fig, ax = plt.subplots()                                            
ax.plot([1,2,3,4],[1,4,2,3])                                        
                                                                    