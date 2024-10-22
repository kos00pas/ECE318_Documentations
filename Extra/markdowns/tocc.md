

<!-- toc -->

- [Documentation: Adding Table of Contents to a Markdown File using `markdown-toc`](#documentation-adding-table-of-contents-to-a-markdown-file-using-markdown-toc)
  * [Prerequisites:](#prerequisites)
    + [Step 1: Install `markdown-toc`](#step-1-install-markdown-toc)
    + [Step 2: Create a Markdown File](#step-2-create-a-markdown-file)
    + [Step 3: Insert the TOC Placeholder](#step-3-insert-the-toc-placeholder)
  * [Section 1](#section-1)
  * [Section 2](#section-2)
    + [Step 5: Verify the Output](#step-5-verify-the-output)
    + [troubleshouting](#troubleshouting)

<!-- tocstop -->

# Documentation: Adding Table of Contents to a Markdown File using `markdown-toc`

## Prerequisites:
- **Node.js** installed on your system.
- **npm** (Node Package Manager) installed along with Node.js.

### Step 1: Install `markdown-toc`
Install the `markdown-toc` package globally using npm:

```bash
npm install -g markdown-toc
```

### Step 2: Create a Markdown File
Create a Markdown file (e.g., `test.md`) that includes several headings. You can use a simple text editor to create the file. Here’s an example of what the content could look like:

```bash
# Title
## Section 1
Content for section 1.

## Section 2
Content for section 2.
```

### Step 3: Insert the TOC Placeholder
To specify where the Table of Contents (TOC) should be inserted, add the `toc` placeholder at the desired location in the file. For example:

```md
# Title

```bash
```
## Section 1
Content for section 1.

## Section 2
Content for section 2.
```

### Step 4: Generate the TOC
Run the following command to generate and insert the TOC into your Markdown file:

```bash
markdown-toc -i test.md
```

The `-i` flag tells `markdown-toc` to modify the file in place, inserting the TOC at the location of the `toc` comment.

### Step 5: Verify the Output
Open the `test.md` file to confirm that the TOC has been inserted correctly.

### troubleshouting
* Remove any duplicate `toc` placeholders if present.
* add to  intelij variables :   File-> Settings -> tools-> terminal PATH=C:\Program Files\nodejs\;C:\Users\kos00\AppData\Roaming\npm;%PATH%




++++++++++++++++++++++++++++++++++++++
## OR
pandoc Tutorial_.md -t html --pdf-engine=wkhtmltopdf -o Tutorial_.pdf
  - comment in pdf 
    -   ` <div style="page-break-after: always;"></div> `
pandoc Tutorial_4.md -t pptx -o Tutorial_4.pptx
   - SPACE AFTER AND BEFORE IMAGE
   - new slide -> new  # 
   - same slides ->  ## ,### 
* soffice --headless --convert-to pdf Tutorial_1.pptx
  - run it as administrator
IF IS POSSIBLE ADD THE IMAGE IN THE END OF PART OF SLIDE
