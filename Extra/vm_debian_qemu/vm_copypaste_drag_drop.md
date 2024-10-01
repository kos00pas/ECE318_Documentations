
# How to Enable Drag and Drop and Clipboard Sharing in VirtualBox

## Method 2: Using Drag and Drop

### 1. Enable Drag and Drop:
- In the VirtualBox window, click on **Devices** → **Drag and Drop** → Choose **Bidirectional** (for drag and drop in both directions).

### 2. Drag and Drop Files:
- After enabling it, simply drag files from your host PC and drop them into the VM window. The file will be copied to your VM’s desktop or default folder.

---

## Installing VirtualBox Guest Additions (if not already installed)

### 1. Install VirtualBox Guest Additions:
- Start your VM and log in.
- In the VirtualBox window, go to **Devices** → **Insert Guest Additions CD Image**.
- Mount the CD inside the VM (if not automatically mounted):
  ```bash
  sudo mount /dev/cdrom /media/cdrom
  ```
- Install Guest Additions by running:
  ```bash
  sudo /media/cdrom/VBoxLinuxAdditions.run
  ```
- Reboot the VM after installation:
  ```bash
  sudo reboot
  ```

---

## Enabling Clipboard Sharing

### 2. Enable Clipboard Sharing:
- After installing Guest Additions, go to **Devices** → **Shared Clipboard** in the VirtualBox window.
- Select **Bidirectional** to enable copying and pasting in both directions (from host to guest and vice versa).

---

## Using Copy-Paste

### 3. Use Copy-Paste:
- Now, you can copy text from your host (Ctrl + C) and paste it into your VM (Ctrl + V), or vice versa.

