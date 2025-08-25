# LLM-Powered Clause Retrieval Web App

## 🚀 API Endpoints

### 1. Main Document Processing
- `POST /api/v1/hackrx/run`
  - **Desc**: Submit policy-related natural language queries; receive structured, explainable JSON with decision and supporting clauses.
  - **Body**:
    ```
    {
      "documents": "<blob_or_url>",
      "questions": [
        "Does this policy cover knee surgery, and what are the conditions?"
      ]
    }
    ```
  - **Header**: `Authorization: Token <your-basic-encryption-token>`

### 2. Document Upload & Listing
- `POST /api/v1/documents/upload`
  - **Desc**: Upload policy or contract files (PDF, DOCX).
  - **Form-data**: field `file` = your PDF/DOCX

- `GET /api/v1/documents`
  - **Desc**: List uploaded documents for current user.

### 3. Embeddings and Search (Internal, for Dev/Testing)
- `POST /api/v1/embeddings/generate`
  - **Desc**: Generate or refresh embeddings for an uploaded doc.
  - **Body**: `{ "document_id": "<id>" }`

- `GET /api/v1/embeddings/search?q=...`
  - **Desc**: Semantic search diagnostic endpoint.

### 4. Health Check
- `GET /api/v1/admin/health`
  - **Desc**: Backend uptime/health test.

---

## 👥 Team Work Assignment & Timeline

| Member   | Role           | Main Responsibilities                               | Dates         |
|----------|----------------|-----------------------------------------------------|---------------|
| Aryan    | Full-stack     | FastAPI backend scaffold, document upload, chunk/embedding, decision logic | Jul 31 – Aug 4 |
| Sakshi   | Full-stack     | REST endpoints, basic encryption, DB integration, FE/BE wiring | Jul 31 – Aug 6 |
| Prajwal  | Frontend       | React structure, component building, Upload & Query, result UIs | Aug 3 – Aug 6 |
| You      | PM, E2E, Docs  | Testing, integration, review, flow docs, final README/demo | Jul 31 – Aug 8 |

---

## 📅 Timeline Table

| Date      | Milestone / Deliverable                       | Owners           |
|-----------|----------------------------------------------|------------------|
| Jul 31    | Repo setup, sample docs, issue planning       | All              |
| Aug 1     | Backend scaffolding, `/documents/upload`      | Aryan, Sakshi    |
| Aug 2     | Document chunking, embeddings, search module  | Aryan            |
| Aug 3     | React app init, routing, uploader UI          | Prajwal (+You)   |
| Aug 4     | Connect FE/BE, embed search from FE           | Sakshi, Prajwal  |
| Aug 5     | Clause matching, logic evaluation             | Aryan            |
| Aug 6     | Result display, error handling, team testing  | Prajwal (+You)   |
| Aug 7     | Final polish, bug bash, flow tests, README    | All              |
| Aug 8     | Submit: repo freeze, docs, demo/video         | All              |

---

## 📈 Project Gantt Flow (Mermaid)

gantt
dateFormat YYYY-MM-DD
title LLM Clause Retrieval Project
section Planning
Repo/Setup, Sample Docs:  done, 2025-07-31,1d

section Backend
Scaffold+Upload:          2025-08-01,1d
Embeddings/Chunking:      2025-08-02,1d
Clause/Logic Evaluation:  2025-08-05,1d

section Frontend
React Init/Upload UI:     2025-08-03,1d
FE-BE API Connect:        2025-08-04,2d
Result/Display Polish:    2025-08-06,1d

section Integration & QA
End-to-End Flow + Docs:   2025-08-07,1d
Submission:               2025-08-08,1d


---

## ✳️ Feature Checklist

- [x] PDF/DOCX upload and preview
- [x] Natural language query interface
- [x] Clause retrieval and semantic search
- [x] Logic processing with explainable outputs
- [x] Structured JSON results for downstream use
- [x] (No JWT) Basic token-based encryption/auth
- [x] Modular backend/React frontend
- [x] End-to-end tests, documentation, and visual flowchart

---

## 📝 Developer Tips

- Use `.env` for sensitive settings - never hardcode tokens/keys!
- Write each API doc as you build the endpoint
- Integrate frontend with test queries early to catch blockers
- Update feature status and tasks nightly in your project tracker
- Bonus: Record a full-stack demo flow for your submission

---

Good luck, team!
