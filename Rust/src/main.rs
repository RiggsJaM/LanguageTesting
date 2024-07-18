fn main() {
    println!("Hello, world!");

    let name = "Jacob";
    let age = 22;
    let alive = true;

    println!("My name is {}, I am {} years old, and {}", name, age, alive);

    if age > 18 {
        println!("You are an adult");
    }
    else {
        println!("You are not an adult");
    }

    for x in 1..11{
        if x < 10 {
            print!("{}, ",x);
        }
        else {
            print!("{}",x);
        }
    }
}
