public class intro {
    public intro(){
        
        System.out.println("""
                           Welcom to Family Feud! In this game, a question will pop up and teams will take turns guessing answers. The better the answer, the more points given. Once all answers are guessed, or when both teams get 3 wrong, the lightning round will start. The lightning round starts with each team guessing a number between one and 20. The Teams whose guess is closest to a randomly generated number goes first. A question will pop up, and each team must generate the best answer they can. The team with the best answer will get points while the other team gets nothing! At the end, each teams total points will be added, and a winner will be choosen!
                           
                           Press enter to begin""");
    }
    public static void clr(){
        System.out.println("\033[H\033[2J");
    }
}