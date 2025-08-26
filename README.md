# 🛠️ Private Minecraft Plugin

A custom plugin for a private Minecraft server that combines essential features with unique **banner-based claims** and a **raid system**.

---

## ✨ Features

- **Custom Join/Leave Messages**  
- **Claim System with Banners** *(in development)*  
  - Protect areas using placed banners  
  - Assign claim owners and trusted members  
  - Automatic block protection inside claims  
- **Raid System** *(in development)*  
  - Player/group raid mechanics  
- **Base Essentials**  
  - Useful commands for both **players** and **administrators**

---

## 📂 Project Structure

- `joinleave/` → Join/Leave message system  
- `claims/` → Banner-based claim system  
- `raids/` → Raid system  
- `essentials/` → Basic commands  

---

## ⚙️ Configuration

The `config.yml` allows full customization of messages and settings:

```yaml
messages:
  join: "&a{player} joined the server!"
  leave: "&c{player} left the server!"

claims:
  max-claims: 5
  claim-size: 16
```

## 🚀 How to Use
- Place the .jar file in the plugins/ folder

- *Restart the server*

- Edit config.yml as needed


## 🛑 Disclaimer
**This plugin is developed for private server use.
It is not finished and not recommended for public production servers (yet).**
