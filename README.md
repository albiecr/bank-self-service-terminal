<img width="100%" bottom=50px src ="https://capsule-render.vercel.app/api?type=waving&height=100&color=FF78CB&section=header&reversal=false&descAlign=22&descAlignY=42"/>


<div align = "center">
<a href="https://github.com/albiecr"><img src="https://readme-typing-svg.herokuapp.com?font=Sour+Gummy&size=68&pause=100&color=EF82F7&width=850&height=90&lines=Bank+Self+Service+Terminal" alt="Typing SVG" /></a></div> <br>
<img align = "right" height = "300" src = "https://github.com/user-attachments/assets/4112619c-500b-464c-9286-a0fa09e5c5a2"/>
<h2>📜 Description </h2>
A Java-based command-line application that simulates an automated banking terminal with core financial operations. Developed as a practical exercise in object-oriented programming and banking business logic.
<h2>✨ Features</h2>
<h4>Banking Operations</h4>
• <b>💰 Deposit:</b> Add funds to account <br>
• <b>💸 Withdrawal:</b> Withdraw money (with balance verification) <br>
• <b>📊 Balance Inquiry:</b> View current account balance <br>
• <b>📜 Statement:</b> List recent transactions (date, time, type, amount) <br>

<h2>📋 Requirements</h2>
• <code>Java SE-17 </code> <br>
• Terminal/Command Prompt access <br>

<h2>⚙️ Installation</h2>
• No special installation required beyond Java <br><br>
• Clone the repository (if applicable): <br><br>
<pre><code class="language-bash">git clone https://github.com/albiecr/bank-self-service-terminal.git
cd bank-self-service-terminal</code></pre>
<h2>🚀 Usage</h2>
• Run the program and interact with the menu: <br><br>
  <pre><code class="language-java"> |BANCO BOLINHA REDONDINHA| TELA INICIAL |

1. Consultar Saldo       → Check balance
2. Realizar depósito     → Make deposit
3. Realizar Saque        → Withdraw money
4. Extrato               → View transaction history
5. Sair do Sistema       → Exit
</code></pre>

• The program will: <br>
1. Prompt you to select option <br>  
2. Ask you values <br>
3. Display operation and balance <br>

<h2>🏗️ Code Structure</h2>
 <pre><code class="language-java"> Bank/
└── BankSelfServiceTerminal.java         // Main class
    ├── main()                           // Entry point
    │   ├── Scanner                      // User input handler
    │   ├── saldo                        // Balance tracker
    │   ├── movim[]                      // Transaction history array (stores last 10 operations)
    │   └── do-while loop                // Main menu system
    │
    ├── Deposit Logic                    // valordep processing (+validation)
    ├── Withdrawal Logic                 // valorsaq processing (+balance check)
    ├── Balance Check                    // Displays current saldo
    └── Statement                        // Prints movim[] with timestamps </code></pre>
<h4>Key Components</h4>
• <b>LocalDateTime:</b> Tracks transaction timestamps <br>
• <b>Array-based Storage</b> <code>movim[]</code> stores last 10 transactions <br>
• <b>Input Validation:</b> Blocks negative values/over-withdrawals <br>

<h2>📄 License </h2>
This project is licensed under the MIT License - see the LICENSE file for details.

<h2>✉️ Contact </h2>
Albertina Rodrigues - albertinacrodrigues@gmail.com <br>
Project Link: https://github.com/albiecr/bank-self-service-terminal

<h2>🔮 Future Improvements </h2>
• Replace array with file/database persistence <br>
• Add PIN authentication <br>
• Implement JavaFX GUI <br>
     
<img width="100%" bottom=50px src ="https://capsule-render.vercel.app/api?type=waving&height=100&color=FF78CB&section=footer&reversal=false&descAlign=22&descAlignY=42"/>
