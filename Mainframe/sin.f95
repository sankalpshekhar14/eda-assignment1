program edasine   
implicit none

   real :: x, y  
    x = 1.0000
    y = sin(x) 
   
   ! output data into a file 
   open(1, file = 'sin.txt', status = 'new')  
      write(1,*) x, y   
   
   close(1) 
   
end program edasine