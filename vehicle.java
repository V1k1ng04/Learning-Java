import java.util.*;
abstract class vehicle
{
vehicle()
{
int noofgears;
}
}
class bike extends vehicle
{
bike()
{
int noofgears = 4;
}
}
class car extends vehicle
{
car()
{
int noofgears = 5;
}
}
public static void main(String args[])
{
bike kawasaki = new bike();
bike avenger = new bike();
car maruti = new car();
car toyota = new car();

}
