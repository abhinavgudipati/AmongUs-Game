package com.company;
import java.util.*;

abstract class player{
    protected String name;
    protected int HP;
    protected String playerCharacter;

    public player( String name, int HP , String playerCharacter ){
        this.name = name;
        this.HP=HP;
        this.playerCharacter = playerCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof player)){
            return false;
        }
        player player = (player) o;
        return HP == player.HP &&
                Objects.equals(name, player.name) &&
                Objects.equals(playerCharacter, player.playerCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, HP, playerCharacter);
    }

    public player() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public String getPlayerCharacter() {
        return playerCharacter;
    }
    public void setPlayerCharacter(String playerCharacter) {
        this.playerCharacter = playerCharacter;
    }
}

class mafia extends player {
    public mafia(){
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHP() {
        return super.getHP();
    }

    @Override
    public void setHP(int HP) {
        super.setHP(2500);
    }

    @Override
    public String getPlayerCharacter() {
        return super.getPlayerCharacter();
    }

    @Override
    public void setPlayerCharacter(String playerCharacter) {
        super.setPlayerCharacter("mafia");
    }

}
class detective extends player{
    public detective() {
        super();
    }

    public static void put(int j, detective d1) {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHP() {
        return super.getHP();
    }

    @Override
    public void setHP(int HP) {
        super.setHP(800);
    }

    @Override
    public String getPlayerCharacter() {
        return super.getPlayerCharacter();
    }

    @Override
    public void setPlayerCharacter(String playerCharacter) {
        super.setPlayerCharacter("detective");
    }
}

class healer extends player{
    public healer(){
        super();
    }

    public static void put(int j, healer h1) {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHP() {
        return super.getHP();
    }

    @Override
    public void setHP(int HP) {
        super.setHP(800);
    }

    @Override
    public String getPlayerCharacter() {
        return super.getPlayerCharacter();
    }

    @Override
    public void setPlayerCharacter(String playerCharacter) {
        super.setPlayerCharacter("healer");
    }
}

class commoner extends player {
    public commoner() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHP() {
        return super.getHP();
    }

    @Override
    public void setHP(int HP) {
        super.setHP(1000);
    }

    @Override
    public String getPlayerCharacter() {
        return super.getPlayerCharacter();
    }

    @Override
    public void setPlayerCharacter(String playerCharacter) {
        super.setPlayerCharacter("commoner");
    }
}

class displayDetails{
    static void displayDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Mafia");
        System.out.print("Enter the Number of players : " );
        int players = scan.nextInt();
        System.out.println("Choose your Character");
        System.out.println("1) Mafia");
        System.out.println("2) Detective");
        System.out.println("3) Healer");
        System.out.println("4) Commoner");
        System.out.println("5) Assign Randomly");
        System.out.println("6) Exit the game");
    }
}

class startGame {
    public HashMap<Integer,player> playersData =new HashMap<Integer,player>(); //
    private HashMap<Integer,mafia> mafias = new HashMap<Integer, mafia>(); //
    private HashMap<Integer,detective> detectives = new HashMap<Integer, detective>(); //
    private HashMap<Integer,healer> healers = new HashMap<Integer, healer>(); //
    private HashMap<Integer,commoner> commoners = new HashMap<Integer, commoner>(); //
    private ArrayList <Object> allPlayers = new ArrayList<Object>(); //generic programming

    private ArrayList<Integer> voteOut = new ArrayList<Integer>();
    private HashMap<Integer, players> playerData = new HashMap<>();
    private ArrayList<Integer> livegamedetails = new ArrayList<Integer>();
    private Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    private Scanner scan = new Scanner(System.in);
    private Random random = new Random();
    public int scanner = scan.nextInt();
    public int max = scanner;
    private int min = 1;
    int detectiveTestCharacter;
    int round = 1;
    final int mav = 4;
    final int miv = 1;
    final int randomChar = random.nextInt((mav - miv)+1)+miv;

    startGame() {

    }

    public void displayDetails(){

    }
    public void randomPlayers() {
//        System.out.println(max);
//        System.out.println(min);
        while (linkedHashSet.size() < scanner ) {
            linkedHashSet.add(random.nextInt((max - min) + 1) + min);
        }
        Iterator it = linkedHashSet.iterator();
        Object[] objArray = linkedHashSet.toArray();
        int count = 0;

        for (int i = count; i < Math.floorDiv(scanner,5); i++) {
            int j = Integer.parseInt(objArray[i].toString());
            players p1 = new players();
            p1.setName("Player" + j);
            p1.setHP(2500);
            p1.setPlayerCharacter("mafia");
//            System.out.println(j + " " + p1.getName() + " " + p1.getHP() + " " + p1.getPlayerCharacter());
            playerData.put(j, p1);
            String str4 = new Integer(p1.getHP()).toString();
            String p3Name = p1.getName().toString();
            mafia m1 = new mafia();
            m1.setName("Player" + j);
            m1.getHP();
            m1.getPlayerCharacter();
            mafias.put(j,m1);
            allPlayers.add(p1.getName());
            count++;
        }
        int count1 = count;
        ;
        for (int i = count1; i < (Math.floorDiv(scanner,5) + Math.floorDiv(scanner,5)); i++) {
            int j = Integer.parseInt(objArray[i].toString());
            players p1 = new players();
            p1.setName("Player" + j);
            p1.setHP(800);
            p1.setPlayerCharacter("detective");
//            System.out.println(j + " " + p1.getName() + " " + p1.getHP() + " " + p1.getPlayerCharacter());
            playerData.put(j, p1);
            detective d1 = new detective();
            d1.setName("Player" + j);
            d1.getHP();
            d1.getPlayerCharacter();
            detectives.put(j,d1);
            allPlayers.add(p1.getName());
            count1++;
        }

        int count2 = count1;

        for (int i = count2; i <  (Math.floorDiv(scanner,10) + Math.floorDiv(scanner,5) + Math.floorDiv(scanner,5));  i++) {
            int j = Integer.parseInt(objArray[i].toString());
            players p1 = new players();
            p1.setName("Player" + j);
            p1.setHP(800);
            p1.setPlayerCharacter("healer");
//            System.out.println(j + " " + p1.getName() + " " + p1.getHP() + " " + p1.getPlayerCharacter());
            playerData.put(j, p1);
            healer h1 = new healer();
            h1.setName("Player" + j);
            h1.getHP();
            h1.getPlayerCharacter();
            healers.put(j,h1);
            allPlayers.add(p1.getName());
            count2++;
        }

        int count3 = count2;

        for (int i = count3 ; i < scanner; i++) {
            int j = Integer.parseInt(objArray[i].toString());
            players p1 = new players();
            p1.setName("Player" + j);
            p1.setHP(1000);
            p1.setPlayerCharacter("commoner");
//            System.out.println(j + " " + p1.getName() + " " + p1.getHP() + " " + p1.getPlayerCharacter());
            playerData.put(j, p1);
            commoner c1 = new commoner();
            c1.setName("Player" + j);
            c1.getHP();
            c1.getPlayerCharacter();
            commoners.put(j,c1);
            allPlayers.add(p1.getName());
            count3++;
        }
        Iterator hm = playerData.entrySet().iterator();
        while (hm.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hm.next();
            int uniqueId = (int) mapElement.getKey();
            players character = (players) mapElement.getValue();
            System.out.println(uniqueId + " " + character.getName() + " " + character.getPlayerCharacter() + " " + character.getHP());
        }
    }

    public void playGame() {
        displayDetails d1 = new displayDetails();
        d1.displayDetails();
        randomPlayers();
        Iterator hm = playerData.entrySet().iterator();
        String o1, o2;
        System.out.println("Choose your Character");
        int playerCharacter = scan.nextInt();
        livegamedetails.add(playerCharacter);
        switch (playerCharacter) {
            case 1:
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object mafChar = character.getPlayerCharacter();
                    Object mafia = "mafia";
                    if (mafChar.equals(mafia)){
                        o1 = "you are player" + uniqueId;
                        System.out.println(o1);
                        break;
                    }
                }
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object mafChar = character.getPlayerCharacter();
                    Object mafia = "mafia";
                    if (mafChar.equals(mafia)) {
                        o2 = "You are a mafia, Other Mafias are player" + uniqueId;
                        System.out.println(o2);
                        break;
                    }
                }
                break;
            case 2:
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object detChar = character.getPlayerCharacter();
                    Object detective = "detective";
                    if (detChar.equals(detective)) {
                        o1 = "you are player" + uniqueId;
                        System.out.println(o1);
                        break;
                    }
                }
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object detChar = character.getPlayerCharacter();
                    Object detective = "detective";
                    if (detChar.equals(detective)) {
                        o2 = "You are a detective, Other detectives are player" + uniqueId;
                        System.out.println(o2);
                        break;
                    }
                }
                break;
            case 3:
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object healerChar = character.getPlayerCharacter();
                    Object healer = "healer";
                    if (healerChar.equals(healer)) {
                        o1 = "you are player" + uniqueId;
                        System.out.println(o1);
                        break;
                    }
                }
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object healerChar = character.getPlayerCharacter();
                    Object healer = "healer";
                    if (healerChar.equals(healer)) {
                        o2 = "You are a healer, Other healers are player" + uniqueId;
                        System.out.println(o2);
                        break;
                    }
                }
                break;
            case 4:
                while (hm.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) hm.next();
                    int uniqueId = (int) mapElement.getKey();
                    players character = (players) mapElement.getValue();
                    Object commonerChar = character.getPlayerCharacter();
                    Object commoner = "commoner";
                    if (commonerChar.equals(commoner)) {
                        o1 = "you are player" + uniqueId;
                        o2 = "You are a commoner, you are not aware of other commoners" + uniqueId;
                        System.out.println(o1);
                        System.out.println(o2);
                        break;
                    }
                }
                break;
            case 5:
                int ma = 4;
                int mi = 1;
                int k = random.nextInt((ma - mi) + 1 + mi);
                if (k == 1) {
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "mafia") {
                            o1 = "you are player" + uniqueId;
                            System.out.println(o1);
                            break;
                        }
                    }
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "mafia") {
                            o2 = "You are a mafia, Other Mafias are player" + uniqueId;
                            System.out.println(o2);
                            break;
                        }
                    }
                    break;
                }
                if (k == 2) {
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "detective") {
                            o1 = "you are player" + uniqueId;
                            System.out.println(o1);
                            break;
                        }
                    }
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "detective") {
                            o2 = "You are a detective, Other detectives are player" + uniqueId;
                            System.out.println(o2);
                            break;
                        }
                    }
                    break;
                }
                if (k == 3) {
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "healer") {
                            o1 = "you are player" + uniqueId;
                            System.out.println(o1);
                            break;
                        }
                    }
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "healer") {
                            o2 = "You are a healer, Other healers are player" + uniqueId;
                            System.out.println(o2);
                            break;
                        }
                    }
                    break;
                }
                if (k == 4) {
                    while (hm.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hm.next();
                        int uniqueId = (int) mapElement.getKey();
                        players character = (players) mapElement.getValue();
                        if (character.getPlayerCharacter() == "commoner") {
                            o1 = "you are player" + uniqueId;
                            o2 = "You are a commoner, you are not aware of other commoners" + uniqueId;
                            System.out.println(o1);
                            System.out.println(o2);
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                System.out.println("--------Thank You for Playing--------");
                break;
            default:
                System.out.println("Invalid option try again");
                break;
        }
        rounds();
    }

    public void rounds() {
        Iterator hm = playerData.entrySet().iterator();
        Iterator hn = playerData.entrySet().iterator();
        Iterator ho = playerData.entrySet().iterator();
        Iterator hi = playerData.entrySet().iterator();
        int count = 0;
        while (hm.hasNext()) { //while loop for number of players remaining
            Map.Entry mapElement = (Map.Entry) hm.next();
            players character = (players) mapElement.getValue();
            count++;
        }
        System.out.print(count + " players are remaining : ");
        while (hn.hasNext()) { // while loop for printing the players who are still alive
            Map.Entry map = (Map.Entry) hn.next();
            players boo = (players) map.getValue();
            System.out.print(boo.getName() + " ");
        }
        System.out.println("Are Alive");

        if(playerData.size() == 2){
            Collection<players> values = playerData.values();
            ArrayList<players> checkmafvals= new ArrayList<>(values);
            System.out.println(checkmafvals);
        }
        int countMafia=0;
        while(ho.hasNext()){
            Map.Entry moov = (Map.Entry) ho.next();
            players character = (players) moov.getValue();
            if(character.getPlayerCharacter() == "mafia"){
                countMafia++;
            }
            else{
                continue;
            }
        }
        int countMafia1 = countMafia;
        if(countMafia1==0){
            System.out.println("GAME OVER");
            System.out.println("The Mafias have lost the game");
            while(hi.hasNext()){
                Map.Entry map = (Map.Entry) hi.next();
                int uniqueid = (int)map.getKey();
                players character = (players) map.getValue();
                if (character.getPlayerCharacter() == "healer"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
                if(character.getPlayerCharacter() == "commoner"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
                if(character.getPlayerCharacter() == "detective"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
            }
            System.exit(0);
        }
        if(countMafia1 == playerData.size()){
            System.out.println("GAME OVER");
            System.out.println("The Mafias have won the game");
            while(hi.hasNext()){
                Map.Entry map = (Map.Entry) hi.next();
                int uniqueid = (int)map.getKey();
                players character = (players) map.getValue();
                if (character.getPlayerCharacter() == "healer"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
                if(character.getPlayerCharacter() == "commoner"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
                if(character.getPlayerCharacter() == "detective"){
                    System.out.println(character.getName() + " was a " + character.getPlayerCharacter());
                }
            }
            System.exit(0);
        }

        Object x = (Integer)livegamedetails.get(0);
        Object x1 = (Integer)1;
        Object x2 = (Integer)2;
        Object x3 = (Integer)3;
        Object x4 = (Integer)4;
        Object x5 = (Integer)5;
        if(x.equals(x1)){ //for player as mafia
            System.out.println("Round " + round);
            playerMafia();
        }
        if(x.equals(x2)){ //for player as detective
            simulateMafia();
            System.out.println("Round " + round);
            playerDetective();
        }
        if(x.equals(x3)){ //for player as healer
            simulateMafia();
            simulateDetective();
            System.out.println("Round " + round);
            playerHealer();
        }
        if(x.equals(x4)){ //for player as commoner
            simulateMafia();
            simulateDetective();
            simulateHealer();
            System.out.println("Round " + round);
            playerCommoner();
        }
        if(x.equals(x5)){
            simulateGame(round,randomChar);
        }
    }

    public void simulateGame(int round , int randomChar){
        if(randomChar == 1){
            System.out.println("Round " + round);
            playerMafia();
        }
        if(randomChar == 2){
            simulateMafia();
            System.out.println("Round " + round);
            playerDetective();
        }
        if(randomChar == 3){
            simulateMafia();
            simulateDetective();
            System.out.println("Round " + round);
            playerHealer();
        }
        if(randomChar == 4){
            simulateMafia();
            simulateDetective();
            simulateHealer();
            System.out.println("Round " + round);
            playerCommoner();
        }
    }

    public void checkNumberofPlayers(HashMap<Integer,players> playerData){
        Iterator k = playerData.entrySet().iterator();
        int count=0;
        while (k.hasNext()) {
            Map.Entry map = (Map.Entry) k.next();
            int uni = (int) map.getKey();
            players boob = (players) map.getValue();
            System.out.println(uni);
            System.out.println(boob.getName());
            System.out.println(boob.getPlayerCharacter());
            count++;
        }
    } //correct method

    public void simulateDetective(){
        int detectiveCount = 0;
        Iterator hp = playerData.entrySet().iterator();
        while (hp.hasNext()){
            Map.Entry mav = (Map.Entry) hp.next();
            int uniqueID = (int)mav.getKey();
            players character = (players) mav.getValue();
            if(character.getPlayerCharacter() == "detective"){
                detectiveCount++;
            }
            else{
                continue;
            }
        }
        if(detectiveCount!=0) {
            int detectiveTest = random.nextInt((max - min) + 1) + min;
            if (playerData.containsKey(detectiveTest)) {
                Iterator ho = playerData.entrySet().iterator();
                while (ho.hasNext()) {
                    Map.Entry mav = (Map.Entry) ho.next();
                    int uniqueID = (int) mav.getKey();
                    players character = (players) mav.getValue();
                    if (uniqueID == detectiveTest) {
                        if (character.getPlayerCharacter() == "mafia") {
                            System.out.println("Detectives have chosen somebody to test");
                            playerData.remove(uniqueID);
                            break;
                        }
                        if (character.getPlayerCharacter() == "detective") {
                            System.out.println("Detectives cannot choose detectives");
                            simulateDetective();
                        }
                        if (character.getPlayerCharacter() != "mafia") {
                            System.out.println("Detectives have chosen somebody to test");
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            else {
                simulateDetective();
            }
        }
        else{
            System.out.println("Detectives have chosen somebody to test");
        }
    } //correct method

    public void simulateMafia(){
        int mafiaCount=0;
        int combinedMafiaHP = 0;
        Iterator check1 = playerData.entrySet().iterator();
        while(check1.hasNext()){
            Map.Entry move = (Map.Entry) check1.next(); //
            players character = (players) move.getValue(); //
            if((character.getPlayerCharacter() == "mafia" ) && (character.getHP() > 0)){
                combinedMafiaHP=character.getHP()+combinedMafiaHP;
                mafiaCount++;
            }
            else{
                continue;
            }
        }
        int Y = mafiaCount;
        int countMafia = 0;
//        System.out.println("Number of valid Mafias is  : " + Y);
        int userMafiaTarget = random.nextInt((max - min)+1)+min;
        Iterator checkMafia = playerData.entrySet().iterator();
        int uniqueID;
        if(playerData.containsKey(userMafiaTarget)){
            while(checkMafia.hasNext()){
                Map.Entry move = (Map.Entry) checkMafia.next(); //
                players characterMafia = (players) move.getValue(); //
                if(countMafia == Y){
                    break;
                }
                else if(characterMafia.getPlayerCharacter() == "mafia"){
                    countMafia++;
                    Iterator checkMafiaTarget = playerData.entrySet().iterator();
                    while (checkMafiaTarget.hasNext()) {
                        Map.Entry moof = (Map.Entry) checkMafiaTarget.next(); //
                        uniqueID = (int)moof.getKey();
                        players characterMafiaTarget = (players) moof.getValue(); //
                        int X = characterMafiaTarget.getHP();
//                        if((userMafiaTarget == uniqueID) && characterMafiaTarget.getPlayerCharacter() != "mafia") {
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP > X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(0);
                                continue;
                            }
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP == X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(0);
                                continue;
                            }
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP < X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(X - combinedMafiaHP);
                                continue;
                            }
//                        }
//                        else{
//                            System.out.println("Choose Valid UserID, the given userID is a mafia, mafias cannot choose mafia to kill by default");
//                            simulateMafia();
//                            break;
//                        }
                    }
                }
                else{
                    continue;
                }
            }
            playerDied();
        }
        else{
//            System.out.println("Choose Valid UserID, the given user ID does not exist or is removed in the previous rounds");
            simulateMafia();
        }
    } //correct method

    public void simulateHealer(){
        Iterator ho = playerData.entrySet().iterator();
        int healerCount = 0;
        while(ho.hasNext()){
            Map.Entry mav = (Map.Entry) ho.next();
            players charac = (players) mav.getValue();
            if(charac.getPlayerCharacter() == "healer"){
                healerCount++;
                break;
            }
            else{
                continue;
            }
        }
        if(healerCount != 0){
            Iterator hp = playerData.entrySet().iterator();
            while(hp.hasNext()){
                Map.Entry map = (Map.Entry) hp.next();
                int healerTest = random.nextInt((max - min) + 1) + min;
                if(playerData.containsKey(healerTest)){
                    System.out.println("Player " + healerTest + " will be healed by the healer");
                    Iterator hn = playerData.entrySet().iterator();
                    while (hn.hasNext()) {
                        Map.Entry moov = (Map.Entry) hn.next();
                        int healerKey = (int) moov.getKey();
                        players characc = (players) moov.getValue();
                        if (healerTest == healerKey) {
                            int k = characc.getHP();
                            int combinedHP = k + 500;
                            characc.setHP(combinedHP);
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                    break;
                }
                else{
                    simulateHealer();
                    break;
                }
            }
//            System.out.println("Healer has chosen someone to heal");
        }
        if(healerCount == 0){
            System.out.println("No one was healed");
        }
    } //Correct methods user

    public void playerMafia(){
        int mafiaCount=0;
        int combinedMafiaHP = 0;
        Iterator checkMafCount = playerData.entrySet().iterator();
        while(checkMafCount.hasNext()){
            Map.Entry move = (Map.Entry) checkMafCount.next(); //
            players character = (players) move.getValue(); //
            if((character.getPlayerCharacter() == "mafia") && (character.getHP() > 0)){
                combinedMafiaHP=character.getHP()+combinedMafiaHP;
                mafiaCount++;
                continue;
            }
            else{
                continue;
            }
        }
        int Y = mafiaCount;
        System.out.println("Number of valid mafias playing in the game is " + Y);
        int countMafia = 0;
        System.out.print("Choose a target as the mafia : ");
        int userMafiaTarget = scan.nextInt();
        Iterator checkMafia = playerData.entrySet().iterator();
//        int uniqueID;
        if(playerData.containsKey(userMafiaTarget)){
            while(checkMafia.hasNext()){
                Map.Entry move = (Map.Entry) checkMafia.next(); //
                players characterMafia = (players) move.getValue(); //
                if(countMafia == Y){
                    break;
                }
                else if(characterMafia.getPlayerCharacter() == "mafia"){
                    countMafia++;
                    Iterator checkMafiaTarget = playerData.entrySet().iterator();
                    while (checkMafiaTarget.hasNext()) {
                        Map.Entry moof = (Map.Entry) checkMafiaTarget.next(); //
                        int uniqueID = (int)moof.getKey();
                        players characterMafiaTarget = (players) moof.getValue(); //
                        int X = characterMafiaTarget.getHP();
//                        if((userMafiaTarget == uniqueID) && characterMafiaTarget.getPlayerCharacter() != "mafia") {
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP > X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(0);
                                continue;
                            }
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP == X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(0);
                                continue;
                            }
                            if ((uniqueID == userMafiaTarget) && (combinedMafiaHP < X)) {
                                characterMafia.setHP(Math.floorDiv(X, Y));
                                characterMafiaTarget.setHP(X - combinedMafiaHP);
                                continue;
                            }
//                        }
//                        else{
//                            System.out.println("Choose Valid UserID, the given userID is a mafia, mafias cannot choose mafia to kill by default");
//                            playerMafia();
//                        }
                    }
                }
                else{
                    continue;
                }
            }
            simulateDetective();
            simulateHealer();
            System.out.println("--End of actions--");
            playerDied();
            setVoteOut();
            checkRounds();
        }
//        if(!playerData.containsKey(userMafiaTarget)){
//        else {
//            System.out.println("Choose Valid UserID, the given user ID does not exist or is removed in the previous rounds");
//            playerMafia();
//        }

    } //Correct Methods USed

//            System.out.println("Mafias have already chosen their target");

    public void playerDetective() {
        System.out.println("Mafias have choosen their target"); //simulateMafia() was already called
        System.out.print("Choose a player to test for the detective : ");
        detectiveTestCharacter = scan.nextInt();
        if(playerData.containsKey(detectiveTestCharacter)){
            Iterator hm = playerData.entrySet().iterator();
            while (hm.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hm.next();
                int uniqueId = (int) mapElement.getKey();
                players character = (players) mapElement.getValue();
                if ((detectiveTestCharacter == uniqueId) && (character.getPlayerCharacter() == "mafia")) {
                    System.out.println("Player" + detectiveTestCharacter + " is the mafia");
                    System.out.println("All the players have chosen to vote out player mafia, " + "Player" + detectiveTestCharacter);
                    playerData.remove(uniqueId);
                    simulateHealer();
                    System.out.println("---End of Actions---");
                    System.out.println("No one died");
                    System.out.println("--End of Round " + round +"--");
                    checkRounds();
                    break;
                }
                if((detectiveTestCharacter == uniqueId) && (character.getPlayerCharacter() == "detective")){
                    System.out.println("Cannot test a detective, please choose another player to test");
                    playerDetective();
                }
                if ((detectiveTestCharacter == uniqueId) && (character.getPlayerCharacter() == "healer")){
                    System.out.println("Player" + detectiveTestCharacter + " is not the mafia");
                    simulateHealer();
                    setVoteOut();
                    System.out.println(" Healers have chosen someone to heal");
                    System.out.println("---End of Actions---");
                    System.out.println("--End of Round " + round +"--");
                    checkRounds();
                    break;
                }
                if((detectiveTestCharacter == uniqueId) && (character.getPlayerCharacter() == "commoner")){
                    System.out.println("Player" + detectiveTestCharacter + " is not the mafia");
                    simulateHealer();
                    setVoteOut();
                    System.out.println(" Healers have chosen someone to heal");
                    System.out.println("---End of Actions---");
                    System.out.println("--End of Round " + round +"--");
                    checkRounds();
                    break;
                }
            }
        }
        else{
            System.out.println("Choose a right/valid player character to test");
            playerDetective();
        }
    } //Correct Methods used

    public void playerHealer(){
        System.out.println("Mafias have choosen their target"); //simulateMafia() was already called
        System.out.println("Detectives have chosen a person to test"); //simulateDetective() was already called
        System.out.print("Choose a player to heal for the healer : ");
        int heal = scan.nextInt();
        if(playerData.containsKey(heal)){
            Iterator ho = playerData.entrySet().iterator();
            int countHealer = 0;
            while(ho.hasNext()){
                Map.Entry mav = (Map.Entry) ho.next();
                players character = (players) mav.getValue();
                if(character.getPlayerCharacter() == "healer"){
                    countHealer++;
                    break;
                }
                else {
                    continue;
                }
            }
            if(countHealer!=0){
                Iterator hp = playerData.entrySet().iterator();
                while(hp.hasNext()){
                    Map.Entry map = (Map.Entry) hp.next();
                    int uniqueIDhealerTarget = (int)map.getKey();
                    players charac = (players) map.getValue();
                    if(heal == uniqueIDhealerTarget){
                        charac.getHP();
                        System.out.println( charac.getName() + " will be healed by the healer");
                        int k = charac.getHP();
                        int combinedHP = k + 500;
                        charac.setHP(combinedHP);
                        System.out.println( charac.getName() + " " + charac.getHP() + " " + charac.getPlayerCharacter());
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
            if(countHealer==0){
                System.out.println("No one was healed, healer is not playing the game");
            }
            setVoteOut();
            System.out.println("--End of actions--");
            System.out.println("--End of Round " + round +"--");
            checkRounds();
        }
        else{
            System.out.println("Please input vaLid uniqueID");
            playerHealer();
        }
    } //Correct Method

    public void playerCommoner(){
        System.out.println("Mafias have choosen their target"); //simulateMafia() was already called
        System.out.println("Detectives have chosen a person to test"); //simulateDetective() was already called
        System.out.println("Healers have already healed a person"); //simulateHealer() was already called
        setVoteOut();
        checkRounds();
    }

    public void playerDied(){
        Iterator check = playerData.entrySet().iterator();
        while(check.hasNext()){
            Map.Entry move = (Map.Entry) check.next(); //
            int removedID = (int)move.getKey();
            players character = (players) move.getValue(); //
            if((character.getPlayerCharacter() != "mafia" ) && (character.getHP() == 0)){
                playerData.remove(removedID);
                System.out.println(character.getName() + " has died");
                break;
            }
            else{
                continue;
            }
        }
    } //Correct method

    public void setVoteOut(){
        voteOut.clear();
        System.out.print("Choose a person to Vote out : ");
        int userVoteOut = scan.nextInt();
        if(playerData.containsKey(userVoteOut)){
            voteOut.add(userVoteOut);
            for (int i = 0; i < playerData.size() - 1; i++) {
                int randomVote = random.nextInt((max - min) + 1) + min;
                if(playerData.containsKey(randomVote)){
                    voteOut.add(randomVote);
                }
                else{
                    i = i -1 ;
                }
            }
            mode(voteOut);
        }
        else{
            System.out.println("Kindly input a valid UniqueID");
            setVoteOut();
        }
    }  //Correct method calls mode function

    public void mode(ArrayList voteOut) {
        int mode = (int) voteOut.get(0);
        int maxCount = 0;
//        System.out.println(voteOut.size());
        for (int i = 0; i < voteOut.size(); i++) {
            int value = (int) voteOut.get(i);
//            System.out.println(value);
            int count = 1;
            for (int j = 0; j < voteOut.size(); j++) {
                if ((int) voteOut.get(j) == value)
                    count++; //
                if (count > maxCount) {
                    mode = value; //
                    maxCount = count; //
                }
            }
        }
        System.out.println("Player to get voted out is Player" + mode);
//        if(livegamedetails.get(0) == mode){
//            simulateGame();
//        }
        removePlayer(mode);
    } //Correct Method calls removeplayer function

    public void removePlayer(int mode) { //create class for this later
        Iterator hm = playerData.entrySet().iterator();
        while (hm.hasNext()) {
            Map.Entry map = (Map.Entry) hm.next();
            int uniqueId = (int) map.getKey();
            players boob = (players) map.getValue();
            if ( uniqueId == mode ) {
                playerData.remove(uniqueId);
                break;
            }
            else{
                continue;
            }
        }
    } //Correct Method removes players having the highest number of votes.

    public void checkRounds(){
        round++;
        rounds();
    }//Correct Method
}

class players{
    private String name;
    private int HP;
    private String playerCharacter;
    public players(){
    }
    public players( String name, int HP , String playerCharacter ){
        this.name = name;
        this.HP=HP;
        this.playerCharacter = playerCharacter;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public String getPlayerCharacter() {
        return playerCharacter;
    }
    public void setPlayerCharacter(String playerCharacter) {
        this.playerCharacter = playerCharacter;
    }
}

public class amongus{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        startGame g = new startGame();
        g.playGame();
    }
}
