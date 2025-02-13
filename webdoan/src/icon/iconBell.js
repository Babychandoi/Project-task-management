import * as React from "react"

function IconBell(props) {
    return (
        <svg
            width={20}
            height={20}
            viewBox="0 0 24 24"
            fill="none"
            xmlns="http://www.w3.org/2000/svg"
            {...props}
        >
            <path
                d="M13.73 21a2 2 0 01-3.46 0M18 8A6 6 0 106 8c0 7-3 9-3 9h18s-3-2-3-9z"
                stroke="#fff"
                strokeWidth={2}
                strokeLinecap="round"
                strokeLinejoin="round"
            />
        </svg>
    )
}

export default IconBell
