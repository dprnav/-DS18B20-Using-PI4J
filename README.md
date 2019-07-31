# -DS18B20-Using-PI4J

Connection:
![alt text](https://i.stack.imgur.com/5EKzW.png)

Steps:

1. sudo nano /boot/config.txt, then add following line at the bottom of the file
   dtoverlay=w1–gpio
2. sudo reboot
3. sudo modprobe w1–gpio
4. sudo modprobe w1-therm
5. cd /sys/bus/w1/devices
6. ls 
7. There is a device 28-* appear if sensor is connected successfully
8. Run the java program to get the readings.
